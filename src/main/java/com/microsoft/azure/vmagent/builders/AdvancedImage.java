package com.microsoft.azure.vmagent.builders;


public class AdvancedImage {

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

    public AdvancedImage(String imageReferenceType,
                         String image,
                         String osType,
                         String imageId,
                         String imagePublisher,
                         String imageOffer,
                         String imageSku,
                         String imageVersion,
                         String agentLaunchMethod,
                         boolean preInstallSsh,
                         String initScript,
                         boolean executeInitScriptAsRoot,
                         boolean doNotUseMachineIfInitFails,
                         String virtualNetworkName,
                         String virtualNetworkResourceGroupName,
                         String subnetName,
                         boolean usePrivateIP,
                         String nsgName,
                         boolean joinDomain,
                         String domainName,
                         String domainOU,
                         String joinDomainCredentialsId,
                         String jvmOptions,
                         String noOfParallelJobs,
                         boolean templateDisabled) {
        this.imageReferenceType = imageReferenceType;
        this.image = image;
        this.osType = osType;
        this.imageId = imageId;
        this.imagePublisher = imagePublisher;
        this.imageOffer = imageOffer;
        this.imageSku = imageSku;
        this.imageVersion = imageVersion;
        this.agentLaunchMethod = agentLaunchMethod;
        this.preInstallSsh = preInstallSsh;
        this.initScript = initScript;
        this.executeInitScriptAsRoot = executeInitScriptAsRoot;
        this.doNotUseMachineIfInitFails = doNotUseMachineIfInitFails;
        this.virtualNetworkName = virtualNetworkName;
        this.virtualNetworkResourceGroupName = virtualNetworkResourceGroupName;
        this.subnetName = subnetName;
        this.usePrivateIP = usePrivateIP;
        this.nsgName = nsgName;
        this.joinDomain = joinDomain;
        this.domainName = domainName;
        this.domainOU = domainOU;
        this.joinDomainCredentialsId = joinDomainCredentialsId;
        this.jvmOptions = jvmOptions;
        this.noOfParallelJobs = noOfParallelJobs;
        this.templateDisabled = templateDisabled;
    }

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
