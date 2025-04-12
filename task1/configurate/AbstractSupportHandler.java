package configurate;

abstract class AbstractSupportHandler implements SupportHandler{

    protected SupportHandler nextHandler;

    @Override
    public SupportHandler set_next(SupportHandler handler) {
        this.nextHandler = handler;
        return handler;
    }
}
