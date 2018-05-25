package org.pek.school.model;

/**
 * Created by e.paku on 2018/05/25.
 */
public class Demo {
    private final long id;
    private final String content;

    public Demo(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
}
