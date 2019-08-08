//package com.principle;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 类描述:
// *
// * @author 陈恩惠
// * @since 2019年08月08日 10:35:00
// */
//public class TreeTableUtils<T extends DataEntity> {
//
//
//    protected T info;
//
//    public T getInfo() {
//        return info;
//    }
//
//    public void setInfo(T info) {
//        this.info = info;
//    }
//
//    //树形结构排序之后list内容
//    private List<T> resultNodes = new ArrayList<T>();
//    //传入list参数
//    private List<T> nodes;
//
//    //通过构造函数初始化
//    public TreeTableUtils(List<T> nodes, T info) {
//        this.nodes = nodes;
//        this.info = info;
//    }
//
//    /**
//     *      * 构建树形结构list
//     *      *
//     *      * @return 返回树形结构List列表
//     *      
//     */
//    public List<T> buildTree() {
//        for (T node : nodes) {
//            if (node.getParentId() == null || "".equals(node.getParentId())) {//通过循环一级节点 就可以通过递归获取二级以下节点
//                resultNodes.add(node);//添加一级节点
//                build(node);//递归获取二级、三级、。。。节点
//            }
//        }
//        return resultNodes;
//    }
//
//
//    /**
//     * 递归循环子节点
//     *
//     * @param node 当前节点
//     *                  
//     */
//    private void build(T node) {
//        List<T> children = getChildren(node);
//        if (!children.isEmpty()) {//如果存在子节点
//            for (T child : children) {//将子节点遍历加入返回值中
//                resultNodes.add(child);
//                build(child);
//            }
//        }
//    }
//
//    /**
//     * @param node    
//     * @return 返回      
//     *      
//     */
//    private List<T> getChildren(T node) {
//        List<T> children = new ArrayList<T>();
//        String id = node.getId();
//        for (T child : nodes) {
//            if (id.equals(child.getParentId())) {//如果id等于父id
//                children.add(child);//将该节点加入循环列表中
//            }
//        }
//        return children;
//    }
//}
//
//
//}
