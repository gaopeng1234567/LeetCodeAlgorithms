package com.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class GroupTreeUtils {

    /**
     * 通用生成树形结构方法
     *
     * @param nodes 树形节点列表
     * @param <T>   model类型
     * @return 树形结构列表
     */
    public static <T extends GroupTreeNode<?>> List<T> buildTreeNodes(List<T> nodes) {
        List<T> roots = new ArrayList<>();
        for (Iterator<T> ite = nodes.iterator(); ite.hasNext(); ) {
            T node = ite.next();
            if (node.root()) {
                roots.add(node);
                ite.remove();
            }
        }
        roots.forEach(r -> {
            setChildren(r, nodes);
        });
        return roots;
    }

    public static <T extends GroupTreeNode> void setChildren(T parent, List<T> nodes) {
        List<T> children = new ArrayList<>();
        Object parentId = parent.id();
        for (Iterator<T> ite = nodes.iterator(); ite.hasNext(); ) {
            T node = ite.next();
            if (Objects.equals(node.parentId(), parentId)) {
                children.add(node);
                ite.remove();
            }
        }
        if (children.isEmpty()) {
            return;
        }
        parent.setChildren(children);
        children.forEach(m -> {
            setChildren(m, nodes);
        });
    }

    /**
     * 获取指定树节点下的所有叶子节点
     *
     * @param parent 父节点
     * @param <T>    实际节点类型
     * @return 叶子节点
     */
    public static <T extends GroupTreeNode<?>> List<T> getNodes(T parent) {
        List<T> nodes = new ArrayList<>();
        fillNode(parent, nodes);
        return nodes;
    }

    /**
     * 填充
     *
     * @param parent
     * @param nodes
     * @param <T>
     */
    public static <T extends GroupTreeNode> void fillNode(T parent, List<T> nodes) {
        List<T> children = parent.getChildren();
        if (children.isEmpty()) {
            nodes.add(parent);
            return;
        }
        // 递归查询node
        for (T child : children) {
            fillNode(child, nodes);
        }
    }

    /**
     * @param <T>         实际节点类型
     * @param targetId    节点id
     * @param allTreeNode 全部树形结构
     * @return
     */
    public static <T extends GroupTreeNode> T getPartChild(List<T> allTreeNode, String targetId) {
        T targetNode = null;
        for (T t : allTreeNode) {
            if (t.id().equals(targetId)) {
                targetNode = t;
                return targetNode;
            }
            if (t.getChildren().size() > 0) {
                getPartChild(t.getChildren(), targetId);
            }
        }
        return targetNode;
    }


    /**
     * {@linkplain GroupTreeUtils}
     *
     * @param <T> 节点id类型
     */
    public interface GroupTreeNode<T> {
        /**
         * 获取节点id
         *
         * @return 树节点id
         */
        T id();

        /**
         * 获取该节点的父节点id
         *
         * @return 父节点id
         */
        T parentId();

        /**
         * 是否是根节点
         *
         * @return true：根节点
         */
        boolean root();

        /**
         * 设置节点的子节点列表
         *
         * @param children 子节点
         */
        void setChildren(List<? extends GroupTreeNode<T>> children);

        /**
         * 获取所有子节点
         *
         * @return 子节点列表
         */
        List<? extends GroupTreeNode<T>> getChildren();
    }
}