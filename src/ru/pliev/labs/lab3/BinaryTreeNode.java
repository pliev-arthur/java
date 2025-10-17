package ru.pliev.labs.lab3;

import java.util.ArrayList;
import java.util.Objects;

public class BinaryTreeNode {
    private Integer value;
    private BinaryTreeNode parent;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode() {
        value = null;
        parent = null;
        leftChild = null;
        rightChild = null;
    }

    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }
    public BinaryTreeNode getParent() {
        return parent;
    }
    public void setParent(BinaryTreeNode parent) {
        this.parent = parent;
    }
    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }
    public BinaryTreeNode getRightChild() {
        return rightChild;
    }
    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void addNode(int value) {
        if (this.value == null) {
            this.value = value;
        }
        else {
            if (value > this.value) {
                if (rightChild == null) {
                    rightChild = new BinaryTreeNode();
                    rightChild.parent = this;
                }
                rightChild.addNode(value);
            }
            else {
                if (leftChild == null) {
                    leftChild = new BinaryTreeNode();
                    leftChild.parent = this;
                }
                leftChild.addNode(value);
            }
        }
    }
    public void deleteNode(int value) {
        if (this.value == null) { //if it's last node
            System.out.println("В дереве нет элемента со значением " + value);
        }
        else {
            if (value > this.value) { //if it isn't value that we search
                if (rightChild == null) {
                    System.out.println("В дереве нет элемента со значением " + value);
                    return;
                }
                rightChild.deleteNode(value); //goes into the rightChild
            }
            else {
                if (value < this.value) { //if it isn't value that we search
                    if (leftChild == null) {
                        System.out.println("В дереве нет элемента со значением " + value);
                        return;
                    }
                    leftChild.deleteNode(value); //goes into the leftChild
                }
                else { //if it is value that we search
                    if (leftChild == null && rightChild == null) { //if it's node without kids
                        if (this.parent.leftChild != null && this.parent.leftChild.value == value) { //if this node is left
                            this.parent.leftChild = null;
                        }
                        if (this.parent.rightChild != null && this.parent.rightChild.value == value) { //if this node is right
                            this.parent.rightChild = null;
                        }
                        this.value = null;
                        System.out.println("Вершина " + value + " удалена");
                        return;
                    }
                    if (leftChild == null) { //if it's node only with rightChild

                        if (this.parent.leftChild != null && this.parent.leftChild.value == value) { //if this node is left
                            this.parent.leftChild = rightChild;
                        }
                        if (this.parent.rightChild != null && this.parent.rightChild.value == value) { //if this node is right
                            this.parent.rightChild = rightChild;
                        }
                        rightChild.parent = this.parent;
                        this.value = null;
                        System.out.println("Вершина " + value + " удалена");
                        return;
                    }
                    if (rightChild == null) { //if it's node only with leftChild
                        if (this.parent.leftChild != null && this.parent.leftChild.value == value) { //if this node is left
                            this.parent.leftChild = leftChild;
                        }
                        if (this.parent.rightChild != null && this.parent.rightChild.value == value) { //if this node is right
                            this.parent.rightChild = leftChild;
                        }
                        leftChild.parent = this.parent;
                        this.value = null;
                        System.out.println("Вершина " + value + " удалена");
                        return;
                    }
                    replaceNode(this);
                    if (this.parent.leftChild != null && this.parent.leftChild.value == value) { //if this node is left
                        this.parent.leftChild = leftChild;
                    }
                    if (this.parent.rightChild != null && this.parent.rightChild.value == value) { //if this node is right
                        this.parent.rightChild = leftChild;
                    }
                    System.out.println("Вершина " + value + " удалена");
                }
            }
        }
    }

    private void replaceNode(BinaryTreeNode node) {
        if (this.rightChild != null) { // finding the most right node
            leftChild.replaceNode(node);
        }
        else {
            node.value = value;
            //deleting last node
            if (this.parent.leftChild != null && Objects.equals(this.parent.leftChild.value, value)) { //if this node is left
                this.parent.leftChild = null;
            }
            if (this.parent.rightChild != null && Objects.equals(this.parent.rightChild.value, value)) { //if this node is right
                this.parent.rightChild = null;
            }
            value = null;
        }
    }
    public String searchAndShow(int value) {
        if (value == this.value) {
            return "" + this;
        }
        if (rightChild != null && value > this.value) {
            return rightChild.searchAndShow(value);
        }
        if (leftChild != null && value <= this.value) {
            return leftChild.searchAndShow(value);
        }
        return "В дереве нет элемента со значением " + value;
    }
    private void collectAllNodes(ArrayList<BinaryTreeNode> resultArray) {
        if (value == null) {
            return;
        }
        if (leftChild != null) {
            leftChild.collectAllNodes(resultArray);
        }
        resultArray.add(this);
        if (rightChild != null) {
            rightChild.collectAllNodes(resultArray);
        }
    }
    public String AllKids() {
        ArrayList<BinaryTreeNode> nodes = new ArrayList<BinaryTreeNode>();
        String result = "";
        collectAllNodes(nodes);
        for (int i = 0; i < nodes.size()-1; i++) {
            if (nodes.get(i).value != value) {
                result += nodes.get(i).value + ", ";
            }
        }
        if (nodes.getLast().value != value) {
            result += nodes.getLast().value;
        }
        return result;
    }
    @Override
    public String toString() {
        if (parent == null) { //if it's root
            if (leftChild != null && rightChild != null) { //if root has 2 kids
                return "\nroot: {" +
                        "value=" + value +
                        ", leftChild=" + leftChild.value +
                        ", rightChild=" + rightChild.value +
                        "}\n" +
                        "all kids of root:\n" +
                        "[" + this.AllKids() + "]\n";
            }
            if (leftChild == null && rightChild == null) { //if root has no kids
                return "\nroot: {" +
                        "value=" + value +
                        "}\n" +
                        "all kids of root:\n" +
                        "[" + this.AllKids() + "]\n";
            }
            if (leftChild == null) { //if root has only rightChild
                return "\nroot: {" +
                        "value=" + value +
                        ", rightChild=" + rightChild.value +
                        "}\n" +
                        "all kids of root:\n" +
                        "[" + this.AllKids() + "]\n";
            }
            //if root has only leftChild ('if' isn't necessary here)
            return "\nroot: {" +
                    "value=" + value +
                    ", leftChild=" + leftChild.value +
                    "}\n" +
                    "all kids of root:\n" +
                    "[" + this.AllKids() + "]\n";
        }
        if (leftChild != null && rightChild != null) { //if node has 2 kids
            return "\nnode: {" +
                    "value=" + value +
                    ", parent=" + parent.value +
                    ", leftChild=" + leftChild.value +
                    ", rightChild=" + rightChild.value +
                    "}\n" +
                    "all kids of node:\n" +
                    "[" + this.AllKids() + "]\n";
        }
        if (leftChild == null && rightChild == null) { //if node has no kids
            return "\nnode: {" +
                    "value=" + value +
                    ", parent=" + parent.value +
                    "}\n";
        }
        if (leftChild == null) { //if node has only rightChild
            return "\nnode: {" +
                    "value=" + value +
                    ", parent=" + parent.value +
                    ", rightChild=" + rightChild.value +
                    "}\n" +
                    "all kids of node:\n" +
                    "[" + this.AllKids() + "]\n";
        }
        //if node has only leftChild ('if' isn't necessary here)
        return "\nnode: {" +
                "value=" + value +
                ", parent=" + parent.value +
                ", leftChild=" + leftChild.value +
                "}\n" +
                "all kids of node:\n" +
                "[" + this.AllKids() + "]\n";
    }
}
