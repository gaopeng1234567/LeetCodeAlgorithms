package com.group;


import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author patrick
 * @date 2021/3/4 2:13 下午
 * @Des 123
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class TreeGroupNode implements GroupTreeUtils.GroupTreeNode {
    private String groupId;
    private String parent;
    private List<TreeGroupNode> children;
    private String name;
    private int taskNum;
    private List<Map<String, Integer>> listStage;


    @Override
    public String id() {
        return this.groupId;
    }

    @Override
    public String parentId() {
        return this.parent;
    }

    @Override
    public boolean root() {
        return Objects.equals(this.parent, "");
    }

    @Override
    public void setChildren(List children) {
        this.children = children;
    }


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public List<TreeGroupNode> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public List<Map<String, Integer>> getListStage() {
        return listStage;
    }

    public void setListStage(List<Map<String, Integer>> listStage) {
        this.listStage = listStage;
    }
}
