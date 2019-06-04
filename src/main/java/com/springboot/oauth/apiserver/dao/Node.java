package com.springboot.oauth.apiserver.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data // getter, setter, toString, hasCode, equals, constructor 등을 자동으로 생성
@Entity
public class Node implements Serializable { // 자바 직렬화
    public Node(){
    }

    public Node(String node_name, String node_info, String node_value){
        this.node_name = node_name;
        this.node_info = node_info;
        this.node_value = node_value;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String node_name;
    String node_info;
    String node_value;

}
