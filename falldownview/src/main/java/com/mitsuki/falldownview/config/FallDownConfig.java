package com.mitsuki.falldownview.config;

public interface FallDownConfig {
    /**
     * 缓存帧的数量，决定了帧队列的大小
     */
    int FRAME_CACHE_SIZE = 10;

    /**
     * 单帧绘制时间差 单位ms
     * 1000/DRAW_DELAY 为每秒的帧率
     * 但可能存在性能不够的情况
     * 导致绘制时间超过该间隔，实际帧率表现不如计算结果
     */
    int DRAW_DELAY = 2000;

    int RENDERING_DELAY = 5;

    /**
     * 元素的量
     */
    int ELEMENT_COUNT = 10;
}