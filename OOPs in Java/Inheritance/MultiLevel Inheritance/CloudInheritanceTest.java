/* 1. Class: CloudResource
This is the base class.
It represents any cloud resource, like a VM, database, or storage.
It has:

A resourceId to identify the resource.

A method provision() that means "create this resource in the cloud".

 Think of it like a basic block in the cloud system.

2. Class: VirtualMachine extends CloudResource
This is a child class of CloudResource.
It represents a virtual machine (VM) — a computer running in the cloud.
It has:

An osType (like Ubuntu, Windows).

A method startVM() to start the virtual machine.

 It builds on the base resource and adds VM-specific features.

3. Class: WebServer extends VirtualMachine
This is a child of VirtualMachine (so a grandchild of CloudResource).
It represents a web server — a VM that runs a website.
It has:

A domain (like example.com).

A method deployWebsite() to launch a website.

 It adds web-related features on top of the VM.*/

// Base class - represents any cloud resource (like VM, DB, etc.)
class CloudResource {
    String resourceId;

    // Constructor to initialize the resource ID
    public CloudResource(String resourceId) {
        this.resourceId = resourceId;
    }

    // Method to provision (create) the cloud resource
    public void provision() {
        System.out.println("Provisioning resource: " + resourceId);
    }
}

// First level derived class - represents a virtual machine (VM)
class VirtualMachine extends CloudResource {
    String osType;

    // Constructor to initialize VM with resource ID and OS type
    public VirtualMachine(String resourceId, String osType) {
        super(resourceId);  // Call parent class (CloudResource) constructor
        this.osType = osType;
    }

    // Method to start the virtual machine
    public void startVM() {
        System.out.println("Starting VM with OS: " + osType);
    }
}

// Second level derived class - represents a web server on a VM
class WebServer extends VirtualMachine {
    String domain;

    // Constructor to initialize the web server with domain name
    public WebServer(String resourceId, String osType, String domain) {
        super(resourceId, osType);  // Call parent class (VirtualMachine) constructor
        this.domain = domain;
    }

    // Method to deploy a website on the server
    public void deployWebsite() {
        System.out.println("Deploying website at: https://" + domain);
    }
}

// Main class to run the program
public class CloudInheritanceTest {
    public static void main(String[] args) {
        // Create object of WebServer (inherits from both VM and CloudResource)
        WebServer server = new WebServer("res-123", "Ubuntu 22.04", "example.com");

        // Call methods from all levels of inheritance
        server.provision();      // Method from CloudResource
        server.startVM();        // Method from VirtualMachine
        server.deployWebsite();  // Method from WebServer
    }
}
