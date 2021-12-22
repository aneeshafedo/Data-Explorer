package io.choreo.dataexplorer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

/**
 * Unit tests.
 */
public class UnitTests {
    private static final Log log = LogFactory.getLog(UnitTests.class);

    @Test
    public void testMe() {
        log.info("Hello");
    }

    @Test
    public void testGetResults() {

        DataExplorerService dataExplorerService = new DataExplorerService();

    }
}
