package com.group;

import com.alibaba.fastjson.JSON;
import com.patrick.algorithms.Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author patrick
 * @date 2021/3/4 2:19 下午
 * @Des 12
 * 最簡單的事是堅持，最難的事還是堅持
 */
public class TestDemo {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        List<Map<String, String>> string1 = demo1.getString1();
        List<TreeGroupNode> collect1 = string1.stream().map(map -> {
            TreeGroupNode groupListNode = new TreeGroupNode();
            groupListNode.setChildren(new ArrayList<>());
            groupListNode.setName(map.get("name"));
            groupListNode.setGroupId(map.get("id"));
            groupListNode.setParent(map.get("parent_id"));
            return groupListNode;
        }).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect1, true));
        List<TreeGroupNode> treeGroupNodes = GroupTreeUtils.buildTreeNodes(collect1);
//        System.out.println(JSON.toJSONString(treeGroupNodes, true));
//        System.out.println(treeGroupNodes.size());
//        List<TreeGroupNode> leafs = TreeUtils.getLeafs(treeGroupNodes.get(0));
//        List<String> collect = leafs.stream().map(TreeGroupNode::getGroupId).collect(Collectors.toList());
//        System.out.println(JSON.toJSONString(collect,true));
        TreeGroupNode treeGroupNode = GroupTreeUtils.getPartChild(treeGroupNodes, "5c81c4d0d3e2a1126ce30049");
        System.out.println(JSON.toJSONString(treeGroupNode, true));

    }
}
