package io.choreo.dataexplorer;

import org.ballerinalang.langserver.commons.registration.BallerinaServerCapability;

/**
 *
 */
public class DataExplorerServerCapabilities extends BallerinaServerCapability {
    private boolean getResults;

    public DataExplorerServerCapabilities() {
        super(DataExplorerConstants.CAPABILITY_NAME);
    }

    public boolean isGetResults() {
        return getResults;
    }

    public void setGenerateOpenAPI(boolean getResults) {
        this.getResults = getResults;
    }
}
