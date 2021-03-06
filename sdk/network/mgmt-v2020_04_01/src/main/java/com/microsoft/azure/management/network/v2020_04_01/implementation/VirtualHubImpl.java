/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_04_01.VirtualHub;
import rx.Observable;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.VirtualHubRouteTable;
import com.microsoft.azure.management.network.v2020_04_01.ProvisioningState;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2020_04_01.VirtualHubRouteTableV2;
import com.microsoft.azure.management.network.v2020_04_01.HubVirtualNetworkConnection;

class VirtualHubImpl extends GroupableResourceCoreImpl<VirtualHub, VirtualHubInner, VirtualHubImpl, NetworkManager> implements VirtualHub, VirtualHub.Definition, VirtualHub.Update {
    VirtualHubImpl(String name, VirtualHubInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<VirtualHub> createResourceAsync() {
        VirtualHubsInner client = this.manager().inner().virtualHubs();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualHub> updateResourceAsync() {
        VirtualHubsInner client = this.manager().inner().virtualHubs();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualHubInner> getInnerAsync() {
        VirtualHubsInner client = this.manager().inner().virtualHubs();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String addressPrefix() {
        return this.inner().addressPrefix();
    }

    @Override
    public SubResource azureFirewall() {
        return this.inner().azureFirewall();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public SubResource expressRouteGateway() {
        return this.inner().expressRouteGateway();
    }

    @Override
    public SubResource p2SVpnGateway() {
        return this.inner().p2SVpnGateway();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public VirtualHubRouteTable routeTable() {
        return this.inner().routeTable();
    }

    @Override
    public SubResource securityPartnerProvider() {
        return this.inner().securityPartnerProvider();
    }

    @Override
    public String securityProviderName() {
        return this.inner().securityProviderName();
    }

    @Override
    public String sku() {
        return this.inner().sku();
    }

    @Override
    public List<VirtualHubRouteTableV2> virtualHubRouteTableV2s() {
        List<VirtualHubRouteTableV2> lst = new ArrayList<VirtualHubRouteTableV2>();
        if (this.inner().virtualHubRouteTableV2s() != null) {
            for (VirtualHubRouteTableV2Inner inner : this.inner().virtualHubRouteTableV2s()) {
                lst.add( new VirtualHubRouteTableV2Impl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<HubVirtualNetworkConnection> virtualNetworkConnections() {
        List<HubVirtualNetworkConnection> lst = new ArrayList<HubVirtualNetworkConnection>();
        if (this.inner().virtualNetworkConnections() != null) {
            for (HubVirtualNetworkConnectionInner inner : this.inner().virtualNetworkConnections()) {
                lst.add( new HubVirtualNetworkConnectionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public SubResource virtualWan() {
        return this.inner().virtualWan();
    }

    @Override
    public SubResource vpnGateway() {
        return this.inner().vpnGateway();
    }

    @Override
    public VirtualHubImpl withAddressPrefix(String addressPrefix) {
        this.inner().withAddressPrefix(addressPrefix);
        return this;
    }

    @Override
    public VirtualHubImpl withAzureFirewall(SubResource azureFirewall) {
        this.inner().withAzureFirewall(azureFirewall);
        return this;
    }

    @Override
    public VirtualHubImpl withExpressRouteGateway(SubResource expressRouteGateway) {
        this.inner().withExpressRouteGateway(expressRouteGateway);
        return this;
    }

    @Override
    public VirtualHubImpl withP2SVpnGateway(SubResource p2SVpnGateway) {
        this.inner().withP2SVpnGateway(p2SVpnGateway);
        return this;
    }

    @Override
    public VirtualHubImpl withRouteTable(VirtualHubRouteTable routeTable) {
        this.inner().withRouteTable(routeTable);
        return this;
    }

    @Override
    public VirtualHubImpl withSecurityPartnerProvider(SubResource securityPartnerProvider) {
        this.inner().withSecurityPartnerProvider(securityPartnerProvider);
        return this;
    }

    @Override
    public VirtualHubImpl withSecurityProviderName(String securityProviderName) {
        this.inner().withSecurityProviderName(securityProviderName);
        return this;
    }

    @Override
    public VirtualHubImpl withSku(String sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public VirtualHubImpl withVirtualHubRouteTableV2s(List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2s) {
        this.inner().withVirtualHubRouteTableV2s(virtualHubRouteTableV2s);
        return this;
    }

    @Override
    public VirtualHubImpl withVirtualNetworkConnections(List<HubVirtualNetworkConnectionInner> virtualNetworkConnections) {
        this.inner().withVirtualNetworkConnections(virtualNetworkConnections);
        return this;
    }

    @Override
    public VirtualHubImpl withVirtualWan(SubResource virtualWan) {
        this.inner().withVirtualWan(virtualWan);
        return this;
    }

    @Override
    public VirtualHubImpl withVpnGateway(SubResource vpnGateway) {
        this.inner().withVpnGateway(vpnGateway);
        return this;
    }

}
