package net.wouterdanes.jcr

import javax.jcr.Property
import javax.jcr.PropertyType
import javax.jcr.Value

/**
 * Created by wouter on 12-03-14.
 */
class Node extends NodeDecorator {

  private static Map propertyToValuePropertyMap = new HashMap()

  static {
    propertyToValuePropertyMap.put(PropertyType.BOOLEAN, 'boolean')
    propertyToValuePropertyMap.put(PropertyType.BINARY, 'binary')
    propertyToValuePropertyMap.put(PropertyType.DATE, 'date')
    propertyToValuePropertyMap.put(PropertyType.DECIMAL, 'decimal')
    propertyToValuePropertyMap.put(PropertyType.DOUBLE, 'double')
    propertyToValuePropertyMap.put(PropertyType.LONG, 'long')
    propertyToValuePropertyMap.put(PropertyType.STRING, 'string')
  }

  private javax.jcr.Node node
  String namespacePrefix = '*'

  Node(final javax.jcr.Node node) {
    super(node)
    this.node = node
  }

  def propertyMissing(String name) {
    def property = findProperty(name)
    if (!property) {
      return null;
    }
    if (property.multiple) {
      return convertToTypedList(property)
    } else {
      return convertValueToType(property.value)
    }
  }

  def propertyMissing(String name, Object value) {
    def property = findProperty(name)
    if (property) {
      property.remove()
    }
    node.setProperty name, value
  }

  static def convertToTypedList(Property property) {
    property.values.collect { convertValueToType(it) }
  }

  static def convertValueToType(Value value) {
    def propertyName = propertyToValuePropertyMap[value.type]
    return value."$propertyName"
  }

  Property findProperty(String name) {
    def property = (Property) node.getProperties().find({ it -> ((Property) it).name == name })
    if (property) {
      return property
    }
    def prefixedProperties = node.getProperties("$namespacePrefix:$name")
    if (!prefixedProperties.hasNext()) {
      return null;
    }
    return prefixedProperties.nextProperty()
  }

}
