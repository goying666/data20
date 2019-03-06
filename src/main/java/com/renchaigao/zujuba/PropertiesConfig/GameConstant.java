package com.renchaigao.zujuba.PropertiesConfig;

import lombok.Getter;

@Getter
public class GameConstant {

    public final static String GAME_LRS= "狼人杀";
    public final static String GAME_THQBY= "天黑请闭眼";
    public final static String GAME_AHSL= "暗黑森林";
    public final static String[] FILTER_INTEGRITY_SCORE= {
            "游客（大于0分）",
            "注册用户（大于10分）",
            "基础认证（大于60分）",
            "附加认证（大于70分）",
            "高级认证（大于80分）",
            "入门玩家（大于85分）",
            "中级玩家（大于90分）",
            "高级玩家（大于100分）",
            "职业玩家（大于110分）",
            "NPC玩家（大于120分）"
    };
    public final static String[] FILTER_GENDER_RATIO= {
            "全男",
            "全女",
            "男女各半",
            "男>1",
            "女>1"
    };

    public final static String[] FILTER_CAREER_SCREENING= {
            "学生",
            "工人",
            "大于18岁",
            "大于25岁",
            "大于30岁",
            "小于30岁",
            "小于25岁",
            "小于18岁"
    };

    public final static String[] FILTER_AGE_SCREENING= {
            "高素质（大于4.5）",
            "无差评",
            "无投诉",
            "无纠纷",
            "无举报",
            "有好评",
            "有MVP"
    };

    public final static String[] FILTER_EVALUATION_SCREENING= {
            "高素质（大于4.5）",
            "无差评",
            "无投诉",
            "无纠纷",
            "无举报",
            "有好评",
            "有MVP"
    };

    public final static String[] FILTER_MARRIAGE= {
            "学生",
            "工人",
            "大于18岁",
            "大于25岁",
            "大于30岁",
            "小于30岁",
            "小于25岁",
            "小于18岁"
    };



}
