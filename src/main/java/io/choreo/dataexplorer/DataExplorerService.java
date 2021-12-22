package io.choreo.dataexplorer;

import org.ballerinalang.annotation.JavaSPIService;
import org.ballerinalang.langserver.commons.service.spi.ExtendedLanguageServerService;
import org.ballerinalang.langserver.commons.workspace.WorkspaceManager;
import org.eclipse.lsp4j.StaticRegistrationOptions;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment;
import org.eclipse.lsp4j.services.LanguageServer;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * ..
 */
@JavaSPIService("org.ballerinalang.langserver.commons.service.spi.ExtendedLanguageServerService")
@JsonSegment("dataExplorerService")
public class DataExplorerService implements ExtendedLanguageServerService {

    private WorkspaceManager workspaceManager;

    private static final String CLIENT_INIT_TEMPLATE = "%s myClient = check new (%s);";
    private static final String QUERY_CALL = "stream<record {}, sql:Error?> queryResults = myClient->query(`%s`);";



    @Override
    public void init(LanguageServer langServer, WorkspaceManager workspaceManager) {
        this.workspaceManager = workspaceManager;
    }

    @Override
    public Class<?> getRemoteInterface() {
        return getClass();
    }

    @JsonRequest
    public CompletableFuture<DataExplorerResponse> getResults(DataExplorerRequest request) {
        System.out.println("Hello");
        return null;
    }

    private String generateFunction(DataExplorerRequest dataExplorerRequest) {
        StringBuilder balFileContent = new StringBuilder();
        if (dataExplorerRequest.getImportsList().size() > 0) {
            for (String balImport : dataExplorerRequest.getImportsList()) {
                balFileContent.append(String.format("import %s", balImport));
            }
        }
        balFileContent.append("function _getQueryResults() returns error|json {\n");
        if (dataExplorerRequest.getParamMap().size() > 0) {
            
        }

    }

}
