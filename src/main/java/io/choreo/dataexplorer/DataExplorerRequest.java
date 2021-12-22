package io.choreo.dataexplorer;

import java.util.List;
import java.util.Map;

/**
 * ..
 */
public class DataExplorerRequest {

    private List<String> importsList; //need to find out the relevant imports only
    private Map<String, Map.Entry<String, String>> paramMap; // need to store paramName, type and value
    private Map<String, String> variableMap;
    private String queryString;
    private String ballerinaTomlFilePath;

    private String clientType;

    public DataExplorerRequest(List<String> importsList, Map<String, Map.Entry<String, String>> paramMap, Map<String,
            String> variableMap, String queryString, String ballerinaTomlFilePath, String clientType) {
        this.importsList = importsList;
        this.paramMap = paramMap;
        this.variableMap = variableMap;
        this.queryString = queryString;
        this.ballerinaTomlFilePath = ballerinaTomlFilePath;
        this.clientType = clientType;
    }

    public List<String> getImportsList() {
        return importsList;
    }

    public void setImportsList(List<String> importsList) {
        this.importsList = importsList;
    }

    public Map<String, Map.Entry<String, String>> getParamMap() {
        return paramMap;
    }

    public void setParamMap(Map<String, Map.Entry<String, String>> paramMap) {
        this.paramMap = paramMap;
    }

    public Map<String, String> getVariableMap() {
        return variableMap;
    }

    public void setVariableMap(Map<String, String> variableMap) {
        this.variableMap = variableMap;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getBallerinaTomlFilePath() {
        return ballerinaTomlFilePath;
    }

    public void setBallerinaTomlFilePath(String ballerinaTomlFilePath) {
        this.ballerinaTomlFilePath = ballerinaTomlFilePath;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

}

