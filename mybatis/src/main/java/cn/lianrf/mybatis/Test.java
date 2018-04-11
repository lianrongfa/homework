package cn.lianrf.mybatis;

public class Test {
    private String id;

    private String tId;

    private String tName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", tId='" + tId + '\'' +
                ", tName='" + tName + '\'' +
                '}';
    }
}