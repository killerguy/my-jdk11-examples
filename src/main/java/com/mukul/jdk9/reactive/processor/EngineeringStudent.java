package com.mukul.jdk9.reactive.processor;

public class EngineeringStudent extends Student {
    private int eid;
    public EngineeringStudent(int id, int eid, String name) {
        super(id, name);
        this.eid = eid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "[id=" + super.getId() + ",name=" + super.getName() + ",eid=" + eid + "]";
    }
}
