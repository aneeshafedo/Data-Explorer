package io.choreo.dataexplorer;

import org.ballerinalang.langserver.commons.registration.BallerinaClientCapability;

/**
 *
 */
public class DataExplorerClientCapabilities extends BallerinaClientCapability {
    private boolean getResults;

    public DataExplorerClientCapabilities() {
        super(DataExplorerConstants.CAPABILITY_NAME);
    }

    public boolean isGetResults() {
        return getResults;
    }

    public void setGenerateOpenAPI(boolean getResults) {
        this.getResults = getResults;
    }
}
