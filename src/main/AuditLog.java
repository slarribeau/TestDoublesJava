package main;

//Interface
public interface AuditLog {
    void log(String logType, String subtype, String data);
}
