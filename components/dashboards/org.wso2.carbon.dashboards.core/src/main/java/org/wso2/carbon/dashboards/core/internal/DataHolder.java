/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.dashboards.core.internal;

import org.wso2.carbon.config.provider.ConfigProvider;
import org.wso2.carbon.uis.spi.Server;

/**
 * This is data holder for config provider implementations.
 */
public class DataHolder {
    private static DataHolder instance = new DataHolder();
    private ConfigProvider configProvider;
    private Server uiServer;

    private DataHolder() {
    }

    /**
     * Provide instance of DataHolder class.
     *
     * @return Instance of DataHolder
     */
    public static DataHolder getInstance() {
        return instance;
    }

    /**
     * Returns config provider.
     *
     * @return Instance of config provider
     */
    public ConfigProvider getConfigProvider() {
        return this.configProvider;
    }

    /**
     * Sets instance of config provider.
     *
     * @param configProvider Instance of config provider
     */
    public void setConfigProvider(ConfigProvider configProvider) {
        this.configProvider = configProvider;
    }

    /**
     * Returns instance of carbon-ui-server.
     *
     * @return Instance of carbon-ui-server
     */
    public Server getUiServer() {
        return uiServer;
    }

    /**
     * Sets instance of carbon-ui-server.
     *
     * @param uiServer Instance of config provider
     */
    public void setUiServer(Server uiServer) {
        this.uiServer = uiServer;
    }
}
