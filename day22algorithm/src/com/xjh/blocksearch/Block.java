package com.xjh.blocksearch;

public class Block {
    private int max;
    private int startindex;
    private int endindex;

    public Block() {
    }

    public Block(int max, int startindex, int endindex) {
        this.max = max;
        this.startindex = startindex;
        this.endindex = endindex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startindex
     */
    public int getStartindex() {
        return startindex;
    }

    /**
     * 设置
     * @param startindex
     */
    public void setStartindex(int startindex) {
        this.startindex = startindex;
    }

    /**
     * 获取
     * @return endindex
     */
    public int getEndindex() {
        return endindex;
    }

    /**
     * 设置
     * @param endindex
     */
    public void setEndindex(int endindex) {
        this.endindex = endindex;
    }

    public String toString() {
        return "block{max = " + max + ", startindex = " + startindex + ", endindex = " + endindex + "}";
    }
}
