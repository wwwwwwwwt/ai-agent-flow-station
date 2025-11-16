package org.ztw.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ztw.infrastructure.dao.po.AiClientSystemPrompt;

import java.util.List;

/**
 * 系统提示词配置表 DAO
 * @author zhangtianwei
 * @date 2025/11/16
 */
@Mapper
public interface IAiClientSystemPromptDao {

    /**
     * 插入系统提示词配置
     */
    void insert(AiClientSystemPrompt aiClientSystemPrompt);

    /**
     * 根据ID更新系统提示词配置
     */
    int updateById(AiClientSystemPrompt aiClientSystemPrompt);

    /**
     * 根据提示词ID更新系统提示词配置
     */
    int updateByPromptId(AiClientSystemPrompt aiClientSystemPrompt);

    /**
     * 根据ID删除系统提示词配置
     */
    int deleteById(Long id);

    /**
     * 根据提示词ID删除系统提示词配置
     */
    int deleteByPromptId(String promptId);

    /**
     * 根据ID查询系统提示词配置
     */
    AiClientSystemPrompt queryById(Long id);

    /**
     * 根据提示词ID查询系统提示词配置
     */
    AiClientSystemPrompt queryByPromptId(String promptId);

    /**
     * 查询启用的系统提示词配置
     */
    List<AiClientSystemPrompt> queryEnabledPrompts();

    /**
     * 根据提示词名称查询系统提示词配置
     */
    List<AiClientSystemPrompt> queryByPromptName(String promptName);

    /**
     * 查询所有系统提示词配置
     */
    List<AiClientSystemPrompt> queryAll();

}
