package com.github.houbb.word.checker.bs;

import java.util.List;

/**
 * <p> 单词拼写检查-接口 </p>
 *
 * <pre> Created: 2018/4/28 上午6:41  </pre>
 * <pre> Project: word-checker  </pre>
 *
 * @author houbinbin
 * @since 0.0.3
 */
public interface IWordCheckerBs {

    /**
     * 是否拼写正确
     * @param word 原始内容
     * @return {@code true} 正确拼写, {@code false} 错误拼写
     */
    boolean isCorrect(final String word);

    /**
     * 最佳纠正结果
     * 1. 如果不存在，则返回单词本身
     * @param word 原始内容
     * @return 最佳匹配结果
     */
    String correct(final String word);

    /**
     * 最佳纠正列表
     * 1. list 的大小永远不会大于 limit，大小返回应该是 [0, limit]
     * @param word 单词
     * @param limit 限制，用于指定返回列表的大小
     * @return 最佳匹配列表
     */
    List<String> correctList(final String word, final int limit);

    /**
     * 所有匹配纠正列表
     * @param word 单词
     * @return 所有匹配纠正列表
     */
    List<String> correctList(final String word);

}
