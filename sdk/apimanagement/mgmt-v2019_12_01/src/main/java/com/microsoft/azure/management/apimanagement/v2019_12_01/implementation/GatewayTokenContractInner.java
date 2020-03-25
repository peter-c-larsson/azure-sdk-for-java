/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Gateway access token.
 */
public class GatewayTokenContractInner {
    /**
     * Shared Access Authentication token value for the Gateway.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get shared Access Authentication token value for the Gateway.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set shared Access Authentication token value for the Gateway.
     *
     * @param value the value value to set
     * @return the GatewayTokenContractInner object itself.
     */
    public GatewayTokenContractInner withValue(String value) {
        this.value = value;
        return this;
    }

}