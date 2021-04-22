package com.patrick.algorithms;

import com.alibaba.fastjson.JSON;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * @author patrick
 * @date 2021/3/3 1:37 下午
 * @Des 最簡單的事是堅持，最難的事還是堅持
 * <p>
 * 1
 * 2
 * 4
 * 7
 * 8
 * 9
 * 5
 * 6
 * 3
 */
public class Demo {

//    private static List<Map<String, String>> list = new ArrayList<>();



    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        List<Map<String,String>> list = demo1.getString1();
        List<GroupListNode> collect1 = list.stream().map(map -> {
            GroupListNode groupListNode = new GroupListNode();
            groupListNode.setNext(new ArrayList<>());
            groupListNode.setName(map.get("name"));
            groupListNode.setGroupId(map.get("id"));
            groupListNode.setParent(map.get("parent_id"));
            return groupListNode;
        }).collect(Collectors.toList());
        //分组
        Map<String, List<GroupListNode>> collect = collect1.stream().collect(Collectors.groupingBy(GroupListNode::getParent));
        System.out.println(JSON.toJSONString(collect, true));
        GroupListNode groupListNode = collect.get("").get(0);
        forEach(collect, groupListNode);
        System.out.println(JSON.toJSONString(groupListNode, true));
    }


    private static GroupListNode getNodeById(Map<String, List<GroupListNode>> collect, String groupId) {

        return null;
    }

    private static void forEach(Map<String, List<GroupListNode>> groupCollect, GroupListNode rootGroup) {
        List<GroupListNode> treeMenuNodes = groupCollect.get(rootGroup.getGroupId());
        if (groupCollect.get(rootGroup.getGroupId()) != null) {
            rootGroup.setNext(treeMenuNodes);
            rootGroup.getNext().forEach(t -> {
                forEach(groupCollect, t);
            });
        }
    }


    private int queryTaskNum() {
        return new Random().nextInt(10000);
    }
}


class GroupListNode {

    private String groupId;
    private String parent;
    private List<GroupListNode> next;
    private String name;
    private int taskNum;
    private List<Map<String, Integer>> listStage;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<GroupListNode> getNext() {
        return next;
    }

    public void setNext(List<GroupListNode> next) {
        this.next = next;
    }

    public GroupListNode() {

    }

    public GroupListNode(String groupId, List<GroupListNode> next) {
        this.groupId = groupId;
        this.next = next;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}