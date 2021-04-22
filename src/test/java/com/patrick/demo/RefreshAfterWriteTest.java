//package com.patrick.demo;
//
//import com.demo.TreeGroupNode;
//import com.google.common.cache.CacheBuilder;
//import com.google.common.cache.CacheLoader;
//import com.google.common.cache.LoadingCache;
//import com.google.common.base.Stopwatch;
//import com.google.common.util.concurrent.ListenableFuture;
//import com.google.common.util.concurrent.ListenableFutureTask;
//import com.patrick.algorithms.Demo1;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.TimeUnit;
//import java.util.stream.Collectors;
//
//public class RefreshAfterWriteTest {
//
//    public Stopwatch stopWatch;
//
//    @Test
//    public void test() throws Exception {
//        stopWatch = Stopwatch.createStarted();
////        stopWatch.start();
//        LoadingCache<String, List<TreeGroupNode>> cache = CacheBuilder.newBuilder().expireAfterWrite(5, TimeUnit.SECONDS)
//                .refreshAfterWrite(1, TimeUnit.SECONDS).build(new CacheLoader<String, List<TreeGroupNode>>() {
//                    @Override
//                    public List<TreeGroupNode> load(String key) throws Exception {
//                        return queryData(key);
//                    }
//                    @Override
//                    public ListenableFuture<List<TreeGroupNode>> reload(Integer key, String oldValue) throws Exception {
//                        ListenableFutureTask<List<TreeGroupNode>> task = ListenableFutureTask.create(() -> load(queryData("")));
////                        executor.execute(task);
//                        return task;
//                    }
//                });
//        List<TreeGroupNode> treeGroupNodes = cache.get("userInfo");
//        System.out.println("我拿到了相关数据: "+treeGroupNodes.size());
////        TimeUnit.SECONDS.sleep(2);
////        List<TreeGroupNode> tow = cache.get("userInfo");
////        System.out.println("我拿到了相关数据: "+tow.size());
//        while (true){
//            TimeUnit.SECONDS.sleep(6);
//            List<TreeGroupNode> userInfo = cache.get("userInfo");
//            System.out.println("第二次我拿到了相关数据: "+userInfo.size());
//        }
//    }
//
//    private List<TreeGroupNode> queryData(String key) throws InterruptedException {
//        TimeUnit.SECONDS.sleep(2);
//        Demo1 demo1 = new Demo1();
//        log("queryData start");
//        List<Map<String, String>> string1 = demo1.getString1();
//        List<TreeGroupNode> collect1 = string1.stream().map(map -> {
//            TreeGroupNode groupListNode = new TreeGroupNode();
//            groupListNode.setChildren(new ArrayList<>());
//            groupListNode.setName(map.get("name"));
//            groupListNode.setGroupId(map.get("id"));
//            groupListNode.setParent(map.get("parent_id"));
//            return groupListNode;
//        }).collect(Collectors.toList());
//        log("queryData end");
//        return collect1;
//    }
//
//    private Thread startLoadingCacheQuery(String clientName, LoadingCache<Integer, String> cache) {
//        Thread thread = new Thread(() -> {
//            log("get start");
//            try {
//                cache.get(1);
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//            log("get end");
//        });
//        thread.setName(clientName);
//        thread.start();
//        return thread;
//    }
//
//    private void log(String msg) {
//        System.out.println(String.format("%ds %s %s", stopWatch.elapsed(TimeUnit.SECONDS), Thread.currentThread().getName(), msg));
//    }
//}