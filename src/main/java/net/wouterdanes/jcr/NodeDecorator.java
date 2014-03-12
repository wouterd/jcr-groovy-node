package net.wouterdanes.jcr;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.jcr.Binary;
import javax.jcr.Item;
import javax.jcr.ItemVisitor;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.Property;
import javax.jcr.PropertyIterator;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.Value;
import javax.jcr.lock.Lock;
import javax.jcr.nodetype.NodeDefinition;
import javax.jcr.nodetype.NodeType;
import javax.jcr.version.Version;
import javax.jcr.version.VersionHistory;

@SuppressWarnings({"deprecation"})
public class NodeDecorator implements javax.jcr.Node {
    public NodeDecorator(javax.jcr.Node node) {
        this.node = node;
    }

    private javax.jcr.Node node;

    @Override
    public Node addNode(final String relPath) throws RepositoryException {
        return node.addNode(relPath);
    }

    @Override
    public Node addNode(final String relPath, final String primaryNodeTypeName) throws RepositoryException {
        return node.addNode(relPath, primaryNodeTypeName);
    }

    @Override
    public void orderBefore(final String srcChildRelPath, final String destChildRelPath) throws RepositoryException {
        node.orderBefore(srcChildRelPath, destChildRelPath);
    }

    @Override
    public Property setProperty(final String name, final Value value) throws RepositoryException {
        return node.setProperty(name, value);
    }

    @Override
    public Property setProperty(final String name, final Value value, final int type) throws RepositoryException {
        return node.setProperty(name, value, type);
    }

    @Override
    public Property setProperty(final String name, final Value[] values) throws RepositoryException {
        return node.setProperty(name, values);
    }

    @Override
    public Property setProperty(final String name, final Value[] values, final int type) throws RepositoryException {
        return node.setProperty(name, values, type);
    }

    @Override
    public Property setProperty(final String name, final String[] values) throws RepositoryException {
        return node.setProperty(name, values);
    }

    @Override
    public Property setProperty(final String name, final String[] values, final int type) throws RepositoryException {
        return node.setProperty(name, values, type);
    }

    @Override
    public Property setProperty(final String name, final String value) throws RepositoryException {
        return node.setProperty(name, value);
    }

    @Override
    public Property setProperty(final String name, final String value, final int type) throws RepositoryException {
        return node.setProperty(name, value, type);
    }

    @Override
    public Property setProperty(final String name, final InputStream value) throws RepositoryException {
        return node.setProperty(name, value);
    }

    @Override
    public Property setProperty(final String name, final Binary value) throws RepositoryException {
        return node.setProperty(name, value);
    }

    @Override
    public Property setProperty(final String name, final boolean value) throws RepositoryException {
        return node.setProperty(name, value);
    }

    @Override
    public Property setProperty(final String name, final double value) throws RepositoryException {
        return node.setProperty(name, value);
    }

    @Override
    public Property setProperty(final String name, final BigDecimal value) throws RepositoryException {
        return node.setProperty(name, value);
    }

    @Override
    public Property setProperty(final String name, final long value) throws RepositoryException {
        return node.setProperty(name, value);
    }

    @Override
    public Property setProperty(final String name, final Calendar value) throws RepositoryException {
        return node.setProperty(name, value);
    }

    @Override
    public Property setProperty(final String name, final Node value) throws RepositoryException {
        return node.setProperty(name, value);
    }

    @Override
    public Node getNode(final String relPath) throws RepositoryException {
        return node.getNode(relPath);
    }

    @Override
    public NodeIterator getNodes() throws RepositoryException {
        return node.getNodes();
    }

    @Override
    public NodeIterator getNodes(final String namePattern) throws RepositoryException {
        return node.getNodes(namePattern);
    }

    @Override
    public NodeIterator getNodes(final String[] nameGlobs) throws RepositoryException {
        return node.getNodes(nameGlobs);
    }

    @Override
    public Property getProperty(final String relPath) throws RepositoryException {
        return node.getProperty(relPath);
    }

    @Override
    public PropertyIterator getProperties() throws RepositoryException {
        return node.getProperties();
    }

    @Override
    public PropertyIterator getProperties(final String namePattern) throws RepositoryException {
        return node.getProperties(namePattern);
    }

    @Override
    public PropertyIterator getProperties(final String[] nameGlobs) throws RepositoryException {
        return node.getProperties(nameGlobs);
    }

    @Override
    public Item getPrimaryItem() throws RepositoryException {
        return node.getPrimaryItem();
    }

    @Override
    public String getUUID() throws RepositoryException {
        return node.getUUID();
    }

    @Override
    public String getIdentifier() throws RepositoryException {
        return node.getIdentifier();
    }

    @Override
    public int getIndex() throws RepositoryException {
        return node.getIndex();
    }

    @Override
    public PropertyIterator getReferences() throws RepositoryException {
        return node.getReferences();
    }

    @Override
    public PropertyIterator getReferences(final String name) throws RepositoryException {
        return node.getReferences(name);
    }

    @Override
    public PropertyIterator getWeakReferences() throws RepositoryException {
        return node.getWeakReferences();
    }

    @Override
    public PropertyIterator getWeakReferences(final String name) throws RepositoryException {
        return node.getWeakReferences(name);
    }

    @Override
    public boolean hasNode(final String relPath) throws RepositoryException {
        return node.hasNode(relPath);
    }

    @Override
    public boolean hasProperty(final String relPath) throws RepositoryException {
        return node.hasProperty(relPath);
    }

    @Override
    public boolean hasNodes() throws RepositoryException {
        return node.hasNodes();
    }

    @Override
    public boolean hasProperties() throws RepositoryException {
        return node.hasProperties();
    }

    @Override
    public NodeType getPrimaryNodeType() throws RepositoryException {
        return node.getPrimaryNodeType();
    }

    @Override
    public NodeType[] getMixinNodeTypes() throws RepositoryException {
        return node.getMixinNodeTypes();
    }

    @Override
    public boolean isNodeType(final String nodeTypeName) throws RepositoryException {
        return node.isNodeType(nodeTypeName);
    }

    @Override
    public void setPrimaryType(final String nodeTypeName) throws RepositoryException {
        node.setPrimaryType(nodeTypeName);
    }

    @Override
    public void addMixin(final String mixinName) throws RepositoryException {
        node.addMixin(mixinName);
    }

    @Override
    public void removeMixin(final String mixinName) throws RepositoryException {
        node.removeMixin(mixinName);
    }

    @Override
    public boolean canAddMixin(final String mixinName) throws RepositoryException {
        return node.canAddMixin(mixinName);
    }

    @Override
    public NodeDefinition getDefinition() throws RepositoryException {
        return node.getDefinition();
    }

    @Override
    public Version checkin() throws RepositoryException {
        return node.checkin();
    }

    @Override
    public void checkout() throws RepositoryException {
        node.checkout();
    }

    @Override
    public void doneMerge(final Version version) throws RepositoryException {
        node.doneMerge(version);
    }

    @Override
    public void cancelMerge(final Version version) throws RepositoryException {
        node.cancelMerge(version);
    }

    @Override
    public void update(final String srcWorkspace) throws RepositoryException {
        node.update(srcWorkspace);
    }

    @Override
    public NodeIterator merge(final String srcWorkspace, final boolean bestEffort) throws RepositoryException {
        return node.merge(srcWorkspace, bestEffort);
    }

    @Override
    public String getCorrespondingNodePath(final String workspaceName) throws RepositoryException {
        return node.getCorrespondingNodePath(workspaceName);
    }

    @Override
    public NodeIterator getSharedSet() throws RepositoryException {
        return node.getSharedSet();
    }

    @Override
    public void removeSharedSet() throws RepositoryException {
        node.removeSharedSet();
    }

    @Override
    public void removeShare() throws RepositoryException {
        node.removeShare();
    }

    @Override
    public boolean isCheckedOut() throws RepositoryException {
        return node.isCheckedOut();
    }

    @Override
    public void restore(final String versionName, final boolean removeExisting) throws RepositoryException {
        node.restore(versionName, removeExisting);
    }

    @Override
    public void restore(final Version version, final boolean removeExisting) throws RepositoryException {
        node.restore(version, removeExisting);
    }

    @Override
    public void restore(final Version version, final String relPath, final boolean removeExisting) throws RepositoryException {
        node.restore(version, relPath, removeExisting);
    }

    @Override
    public void restoreByLabel(final String versionLabel, final boolean removeExisting) throws RepositoryException {
        node.restoreByLabel(versionLabel, removeExisting);
    }

    @Override
    public VersionHistory getVersionHistory() throws RepositoryException {
        return node.getVersionHistory();
    }

    @Override
    public Version getBaseVersion() throws RepositoryException {
        return node.getBaseVersion();
    }

    @Override
    public Lock lock(final boolean isDeep, final boolean isSessionScoped) throws RepositoryException {
        return node.lock(isDeep, isSessionScoped);
    }

    @Override
    public Lock getLock() throws RepositoryException {
        return node.getLock();
    }

    @Override
    public void unlock() throws RepositoryException {
        node.unlock();
    }

    @Override
    public boolean holdsLock() throws RepositoryException {
        return node.holdsLock();
    }

    @Override
    public boolean isLocked() throws RepositoryException {
        return node.isLocked();
    }

    @Override
    public void followLifecycleTransition(final String transition) throws RepositoryException {
        node.followLifecycleTransition(transition);
    }

    @Override
    public String[] getAllowedLifecycleTransistions() throws RepositoryException {
        return node.getAllowedLifecycleTransistions();
    }

    @Override
    public String getPath() throws RepositoryException {
        return node.getPath();
    }

    @Override
    public String getName() throws RepositoryException {
        return node.getName();
    }

    @Override
    public Item getAncestor(final int depth) throws RepositoryException {
        return node.getAncestor(depth);
    }

    @Override
    public Node getParent() throws RepositoryException {
        return node.getParent();
    }

    @Override
    public int getDepth() throws RepositoryException {
        return node.getDepth();
    }

    @Override
    public Session getSession() throws RepositoryException {
        return node.getSession();
    }

    @Override
    public boolean isNode() {
        return node.isNode();
    }

    @Override
    public boolean isNew() {
        return node.isNew();
    }

    @Override
    public boolean isModified() {
        return node.isModified();
    }

    @Override
    public boolean isSame(final Item otherItem) throws RepositoryException {
        return node.isSame(otherItem);
    }

    @Override
    public void accept(final ItemVisitor visitor) throws RepositoryException {
        node.accept(visitor);
    }

    @Override
    public void save() throws RepositoryException {
        node.save();
    }

    @Override
    public void refresh(final boolean keepChanges) throws RepositoryException {
        node.refresh(keepChanges);
    }

    @Override
    public void remove() throws RepositoryException {
        node.remove();
    }
}
