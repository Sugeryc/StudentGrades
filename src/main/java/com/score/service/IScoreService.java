package com.score.service;

import com.github.pagehelper.PageInfo;
import com.score.bean.ResultObject;
import com.score.bean.TScore;
import com.score.bean.TStudent;

public interface IScoreService {
    PageInfo<TScore> insertScore(TScore score);

    ResultObject<Object> getAllScore(TScore score, int limit, int page);

    Integer updateScore(TScore score);

    Integer deleteScore(Integer scoreId);

    PageInfo<TStudent> getAllFinalScore(TStudent student, int limit, int page);

}
