package com.example.n56.pokemon;

import java.io.Serializable;

/**
 * Created by N56 on 25.7.2016.
 */
public class Pokemon implements Serializable {
    String name, type1, type2, weakness1, weakness2, weakness3, weakness4;
    int image_id;

    public Pokemon(){

    }

    public Pokemon(int image_id, String name){
        this.image_id = image_id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getWeakness1() {
        return weakness1;
    }

    public void setWeakness1(String weakness1) {
        this.weakness1 = weakness1;
    }

    public String getWeakness4() {
        return weakness4;
    }

    public void setWeakness4(String weakness4) {
        this.weakness4 = weakness4;
    }

    public String getWeakness2() {
        return weakness2;
    }

    public void setWeakness2(String weakness2) {
        this.weakness2 = weakness2;
    }

    public String getWeakness3() {
        return weakness3;
    }

    public void setWeakness3(String weakness3) {
        this.weakness3 = weakness3;
    }
}
