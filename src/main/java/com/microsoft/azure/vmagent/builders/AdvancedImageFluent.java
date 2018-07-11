package com.microsoft.azure.vmagent.builders;


import com.microsoft.azure.vmagent.ImageReferenceType;
import com.microsoft.azure.vmagent.util.Constants;

public class AdvancedImageFluent<T extends AdvancedImageFluent<T>> {

    private String imageReferenceType;

    private String image;

    private String osType;

    private String imageId;

    private String imagePublisher;

    private String imageOffer;

    private String imageSku;

    private String imageVersion;

    private String agentLaunchMethod;

    private boolean preInstallSsh;

    private String initScript;

    private boolean executeInitScriptAsRoot;

    private boolean doNotUseMachineIfInitFails;

    private String virtualNetworkName;

    private String virtualNetworkResourceGroupName;

    private String subnetName;

    private boolean usePrivateIP;

    private String nsgName;

    private boolean joinDomain;

    private String domainName;

    private String domainOU;

    private String joinDomainCredentialsId;

    private String jvmOptions;

    private String noOfParallelJobs;

    private boolean templateDisabled;

    public AdvancedImageFluent() {
        this.imageReferenceType = ImageReferenceType.REFERENCE.getName();
        this.imageVersion = "latest";
        this.osType = Constants.OS_TYPE_LINUX;
        this.agentLaunchMethod = Constants.LAUNCH_METHOD_SSH;
        this.preInstallSsh = true;
        this.executeInitScriptAsRoot = true;
        this.doNotUseMachineIfInitFails = true;
        this.usePrivateIP = false;
        this.noOfParallelJobs = "1";
        this.templateDisabled = false;
        this.joinDomain = false;
    }

    //CHECKSTYLE:OFF
    public T withCustomImage(String imageUrl) {
        this.imageReferenceType = ImageReferenceType.CUSTOM.getName();
        this.image = imageUrl;
        return (T) this;
    }

    public T withCustomManagedImage(String imageId) {
        this.imageReferenceType = ImageReferenceType.CUSTOM_IMAGE.getName();
        this.imageId = imageId;
        return (T) this;
    }

    public T withReferenceImage(String imagePublisher,
                                String imageOffer,
                                String imageSku,
                                String imageVersion) {
        this.imageReferenceType = ImageReferenceType.REFERENCE.getName();
        this.imagePublisher = imagePublisher;
        this.imageOffer = imageOffer;
        this.imageSku = imageSku;
        this.imageVersion = imageVersion;
        return (T) this;
    }

    public T withOsType(String osType) {
        this.osType = osType;
        return (T) this;
    }

    public T withLaunchMethod(String launchMethod) {
        this.agentLaunchMethod = launchMethod;
        return (T) this;
    }

    public T withPreInstallSsh(boolean preInstallSsh) {
        this.preInstallSsh = preInstallSsh;
        return (T) this;
    }

    public T withInitScript(String initScript) {
        this.initScript = initScript;
        return (T) this;
    }

    public T withRunScriptAsRoot(boolean executeInitScriptAsRoot) {
        this.executeInitScriptAsRoot = executeInitScriptAsRoot;
        return (T) this;
    }

    public T withDoNotUseMachineIfInitFails(boolean doNotUseMachineIfInitFails) {
        this.doNotUseMachineIfInitFails = doNotUseMachineIfInitFails;
        return (T) this;
    }

    public T withVirtualNetworkName(String virtualNetworkName) {
        this.virtualNetworkName = virtualNetworkName;
        return (T) this;
    }

    public T withVirtualNetworkResourceGroupName(String virtualNetworkResourceGroupName) {
        this.virtualNetworkResourceGroupName = virtualNetworkResourceGroupName;
        return (T) this;
    }

    public T withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return (T) this;
    }

    public T withUsePrivateIP(boolean usePrivateIP) {
        this.usePrivateIP = usePrivateIP;
        return (T) this;
    }

    public T withNetworkSecurityGroupName(String nsgName) {
        this.nsgName = nsgName;
        return (T) this;
    }

    public T withJoinDomain(boolean joinDomain) {
        this.joinDomain = joinDomain;
        return (T) this;
    }

    public T withDomainName(String domainName) {
        this.domainName = domainName;
        return (T) this;
    }
    
    public T withDomainOU(String domainOu) {
        this.domainOU = domainOU;
        return (T) this;
    }
    
    public T withJoinDomainCredentialsId(String joinDomainCredentialsId) {
        this.joinDomainCredentialsId = joinDomainCredentialsId;
        return (T) this;
    }

    public T withJvmOptions(String jvmOptions) {
        this.jvmOptions = jvmOptions;
        return (T) this;
    }

    public T withNumberOfExecutors(String noOfParallelJobs) {
        this.noOfParallelJobs = noOfParallelJobs;
        return (T) this;
    }
    public T withDisableTemplate(boolean templateDisabled) {
        this.templateDisabled = templateDisabled;
        return (T) this;
    }
    //CHECKSTYLE:ON

    public String getImageReferenceType() {
        return imageReferenceType;
    }

    public String getImage() {
        return image;
    }

    public String getOsType() {
        return osType;
    }

    public String getImageId() {
        return imageId;
    }

    public String getImagePublisher() {
        return imagePublisher;
    }

    public String getImageOffer() {
        return imageOffer;
    }

    public String getImageSku() {
        return imageSku;
    }

    public String getImageVersion() {
        return imageVersion;
    }

    public String getAgentLaunchMethod() {
        return agentLaunchMethod;
    }

    public boolean isPreInstallSsh() {
        return preInstallSsh;
    }

    public String getInitScript() {
        return initScript;
    }

    public boolean isExecuteInitScriptAsRoot() {
        return executeInitScriptAsRoot;
    }

    public boolean isDoNotUseMachineIfInitFails() {
        return doNotUseMachineIfInitFails;
    }

    public String getVirtualNetworkName() {
        return virtualNetworkName;
    }

    public String getVirtualNetworkResourceGroupName() {
        return virtualNetworkResourceGroupName;
    }

    public String getSubnetName() {
        return subnetName;
    }

    public boolean isUsePrivateIP() {
        return usePrivateIP;
    }

    public String getNsgName() {
        return nsgName;
    }

    public boolean getJoinDomain() {
        return joinDomain;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getDomainOU() {
        return domainOU;
    }

    public String getJoinDomainCredentialsId() {
        return joinDomainCredentialsId;
    }

    public String getJvmOptions() {
        return jvmOptions;
    }

    public String getNoOfParallelJobs() {
        return noOfParallelJobs;
    }

    public boolean isTemplateDisabled() {
        return templateDisabled;
    }
}
