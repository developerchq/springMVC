package com.ab.vote;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 *
 * @author Jack.he
 * @date 2017-1-24
 *
 */
public class Example implements Serializable {
    /**  */
    private Integer id;

    /**  */
    private String name;

    /**  */
    private Integer age;

    /**  */
    private String ext;

    /**  */
    private BigDecimal salary;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}