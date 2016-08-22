package com.pineone.icbms.so.domain.entity;


/**
 * Created by melvin on 2016. 8. 1..
 * NOTE: Logic 에서 사용할 Domain Entity
 */
public class Domain {

    String id;
    String name;
    String uri;

    public Domain() {
    }

    public Domain(String id, String name, String uri){
        this.id = id;
        this.name = name;
        this.uri = uri;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
