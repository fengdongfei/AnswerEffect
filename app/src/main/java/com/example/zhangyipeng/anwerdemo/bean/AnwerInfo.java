package com.example.zhangyipeng.anwerdemo.bean;

import java.util.List;

/**
 * Created by zhangyipeng on 16/6/30.
 */
public class AnwerInfo{

    public PageBean page;
    public List<QueryQuestionListBean> queryQuestionList;

    public static class PageBean {
        public int totalResultSize;
        public int totalPageSize;
        public int pageSize;
        public int currentPage;
        public int startRow;
        public boolean first;
        public boolean last;
    }
    public static class QueryQuestionListBean {
        public int id;
        public String qstContent;
        public String isAsr;
        public int qstType;
        public int level;
        public int status;
        public int qstRecordstatus;
        public int favoritesId;
        public int placeNumber;
        public int time;
        public int rightTime;
        public int errorTime;
        public double accuracy;
        public int score;
        public int userscore;
        public int state;
        public String shortQstContent;
        public int extendContentType;
        public String field;
        public List<OptionsBean> options;
        public List<?> fillList;
        public List<?> userFillList;

        public static class OptionsBean {
            /**
             * id : 1382
             * qstId : 277
             * optContent : 去问问
             * optOrder : A
             * optAnswer : A
             * addTime : 2019-08-09 14:02:14
             * qstType : 0
             * doNum : 0
             */

            public int id;
            public int qstId;
            public String optContent;
            public String optOrder;
            public String optAnswer;
            public String addTime;
            public int qstType;
            public int doNum;
        }
    }
}
