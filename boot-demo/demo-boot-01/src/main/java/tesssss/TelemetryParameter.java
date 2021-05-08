package tesssss;

/**
 * TODO(qianjin): this class is designed to replace TelemetryConstants. action: replace all references to it and then delete it.
 */
public enum TelemetryParameter implements AAA {
    /**
     * Please DO NOT create instance here.
     */
    ;

    private final String serviceName;
    private final String operationName;

    @Override
    public String getOperationName() {
        return operationName;
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }

    private TelemetryParameter(String serviceName, String operationName) {
        this.serviceName = serviceName;
        this.operationName = operationName;
    }

    private static TelemetryParameter create(String serviceName, String operationName) {
        String name = serviceName + "#" + operationName;
        return EnumUtils.addEnum(TelemetryParameter.class, name, new Class<?>[] {String.class, String.class}, new Object[] {serviceName, operationName});
    }

    private static String buildOperationName(String head, String tail) {
        return head + "-" + tail;
    }

    public interface WebApp {
        String MODULE = "webapp";

        TelemetryParameter CREATE = create(MODULE, "create-webapp");
        TelemetryParameter DELETE = create(MODULE, "delete-webapp");
        TelemetryParameter DEPLOY = create(MODULE, "deploy-webapp");
        TelemetryParameter START = create(MODULE, "start-webapp");
        TelemetryParameter STOP = create(MODULE, "stop-webapp");
        TelemetryParameter RESTART = create(MODULE, "restart-webapp");
        TelemetryParameter SHOW_PROPERTIES = create(MODULE, "showprop-webapp");
        TelemetryParameter SHINTO = create(MODULE, "sshinto-webapp");
        TelemetryParameter OPEN_IN_PORTAL = create(MODULE, "webap-open-in-portal");
        TelemetryParameter OPEN_IN_BROWSER = create(MODULE, "open-inbrowser-webapp");
        TelemetryParameter START_STREAMING_LOG = create(MODULE, "start-streaming-log-webapp");
        TelemetryParameter STOP_STREAMING_LOG = create(MODULE, "stop-streaming-log-webapp");

        TelemetryParameter DEPLOY_DOCKERLOCAL = create(MODULE, "deploy-webapp-dockerlocal");
        TelemetryParameter DEPLOY_DOCKERHOST = create(MODULE, "deploy-webapp-dockerhost");
        TelemetryParameter DEPLOY_CONTAINER = create(MODULE, "deploy-webapp-container");
        // deployment slot
        TelemetryParameter OPEN_CREATEWEBAPP_DIALOG = create(MODULE, "open-create-webapp-dialog");

        TelemetryParameter DEPLOY_TO_SLOT = create(MODULE, "webappDeployToSlot");
        TelemetryParameter CREATE_NEWWEBAPP = create(MODULE, "createNewWebapp");

        interface DeploymentSlot {
            TelemetryParameter DEPLOY = create(MODULE, "deploy-webapp-slot");
            TelemetryParameter CREATE = create(MODULE, "create-webapp-slot");
            TelemetryParameter STOP = create(MODULE, "stop-webapp-slot");
            TelemetryParameter START = create(MODULE, "start-webapp-slot");
            TelemetryParameter RESTART = create(MODULE, "restart-webapp-slot");
            TelemetryParameter DELETE = create(MODULE, "delete-webapp-slot");
            TelemetryParameter SWAP = create(MODULE, "swap-webapp-slot");
            TelemetryParameter SHOW_PROPERTIES = create(MODULE, "show-webapp-slot-prop");
            TelemetryParameter OPEN_IN_BROWSER = create(MODULE, "open-webappslot-inbrowser");
            TelemetryParameter OPEN_IN_PORTAL = create(MODULE, "open-webappslot-in-portal");
            TelemetryParameter START_STREAMING_LOG = create(MODULE, "start-streaming-log-webapp-slot");
            TelemetryParameter STOP_STREAMING_LOG = create(MODULE, "stop-streaming-log-webapp-slot");
        }
    }

    public interface FunctionApp {
        String MODULE = "function";

        TelemetryParameter TRIGGER = create(MODULE, buildOperationName("trigger", MODULE));
        TelemetryParameter ENABLE = create(MODULE, buildOperationName("enable", MODULE));
        TelemetryParameter DISABLE = create(MODULE, buildOperationName("disable", MODULE));
        TelemetryParameter RUN = create(MODULE, "run-function-app");
        TelemetryParameter CREATE_TRIGGER = create(MODULE, "create-function-trigger");
        TelemetryParameter CREATE_PROJECT = create(MODULE, "create-function-project");
        TelemetryParameter CREATE = create(MODULE, "create-function-app");
        TelemetryParameter DEPLOY = create(MODULE, "deploy-function-app");
        TelemetryParameter DELETE = create(MODULE, "delete-function-app");
        TelemetryParameter START = create(MODULE, "start-function-app");
        TelemetryParameter STOP = create(MODULE, "stop-function-app");
        TelemetryParameter RESTART = create(MODULE, "restart-function-app");
        TelemetryParameter SHOW_PROPERTIES = create(MODULE, "showprop-function-app");
        TelemetryParameter START_STREAMING_LOG = create(MODULE, "start-streaming-log-function-app");
        TelemetryParameter STOP_STREAMING_LOG = create(MODULE, "stop-streaming-log-function-app");
        TelemetryParameter OPEN_IN_PORTAL = create(MODULE, "open-inbrowser-function-app");
    }

    public interface MySQL {
        String MODULE = "azure-mysql";

        TelemetryParameter CREATE = create(MODULE, buildOperationName(MODULE, "create"));
        TelemetryParameter DELETE = create(MODULE, buildOperationName(MODULE, "delete"));
        TelemetryParameter START = create(MODULE, buildOperationName(MODULE, "start"));
        TelemetryParameter STOP = create(MODULE, buildOperationName(MODULE, "stop"));
        TelemetryParameter RESTART = create(MODULE, buildOperationName(MODULE, "restart"));
        TelemetryParameter OPEN_IN_PORTAL = create(MODULE, buildOperationName(MODULE, "open-in-portal"));
        TelemetryParameter SHOW_PROPERTIES = create(MODULE, buildOperationName(MODULE, "show-properties"));
        TelemetryParameter CONNECT_TO_SERVER = create(MODULE, buildOperationName(MODULE, "connect-to-server"));
        TelemetryParameter BIND_INTO = create(MODULE, buildOperationName(MODULE, "bind-into"));
    }

    public interface SpringCloud {
        String MODULE = "springcloud";

        TelemetryParameter CREATE = create(MODULE, "create-springcloud-app");
        TelemetryParameter DELETE = create(MODULE, "delete-springcloud-app");
        TelemetryParameter START = create(MODULE, "start-springcloud-app");
        TelemetryParameter STOP = create(MODULE, "stop-springcloud-app");
        TelemetryParameter RESTART = create(MODULE, "restart-springcloud-app");
        TelemetryParameter OPEN_IN_PORTAL = create(MODULE, "open-inportal-springcloud-app");
        TelemetryParameter OPEN_IN_BROWSER = create(MODULE, "open-inbrowser-springcloud-app");
        TelemetryParameter SHOW_PROPERTIES = create(MODULE, "showprop-springcloud-app");

        TelemetryParameter SAVE = create(MODULE, "save-springcloud-app");
        TelemetryParameter REFRESH = create(MODULE, "refresh-springcloud-app");
        TelemetryParameter DEPLOY = create(MODULE, "deploy-springcloud-app");
        TelemetryParameter ADD_DEPENDENCY = create(MODULE, "add-dependency-springcloud-app");
        TelemetryParameter START_STREAMING_LOG = create(MODULE, "start-streaming-log-springcloud-app");
        TelemetryParameter STOP_STREAMING_LOG = create(MODULE, "stop-streaming-log-springcloud-app");
    }

    public interface RedisCache {
        String MODULE = "redis";

        TelemetryParameter CREATE = create(MODULE, "create-redis");
        TelemetryParameter DELETE = create(MODULE, "delete-redis");
        TelemetryParameter SCAN = create(MODULE, "scan-redis");
        TelemetryParameter GET = create(MODULE, "get-redis");
        TelemetryParameter OPEN_IN_PORTAL = create(MODULE, "open-browser-redis");
        TelemetryParameter SHOW_PROPERTIES = create(MODULE, "readprop-redis");
        TelemetryParameter OPEN_EXPLORER = create(MODULE, "open-explorer-redis");
    }

}
