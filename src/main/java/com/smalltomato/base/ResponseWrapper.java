package com.smalltomato.base;

import com.smalltomato.base.code.ResultCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Controller 统一页面返回格式
 * Created by feiL on 2017/11/30.
 */
public class ResponseWrapper {
    public static String DEFAULT_BODY_PART_NAME = "extra_object";

    private String result = ResultCode.SUCCESS;

    private Map<String, Object> body = new HashMap<String, Object>();

    public ResponseWrapper() {
        this(ResultCode.SUCCESS, null);
    }

    public ResponseWrapper(String result, String info) {
        this(result, info, null, null);
    }

    public ResponseWrapper(String result, String info, String relName, Object relObj) {
        super();
        this.setResult(result);
        this.setInfo(info);
        this.addBodyPart(relName, relObj);
    }

    public ResponseWrapper(String result, String info, Map<String, Object> body) {
        super();
        this.setResult(result);
        this.setInfo(info);
        this.setBody(body);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Map<String, Object> getBody() {
        return body;
    }

    public void setBody(Map<String, Object> body) {
        this.body = body;
    }

    public void setInfo(String info) {
        this.addBodyPart("info", info);
    }

    private ResponseWrapper addBodyPart(String key, Object value) {
        if (null == key && null == value) {
            return this;
        }
        this.body.put(key, value);
        return this;
    }
}
