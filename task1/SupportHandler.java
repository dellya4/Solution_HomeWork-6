interface SupportHandler {
    SupportHandler set_next(SupportHandler handler);
    void handle();
}
