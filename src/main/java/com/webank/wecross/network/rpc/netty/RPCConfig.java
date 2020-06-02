package com.webank.wecross.network.rpc.netty;

import org.springframework.core.io.Resource;

public class RPCConfig {

    public enum SSLSwitch {
        SSL_OFF(2),
        SSL_ON(1),
        SSL_ON_CLIENT_AUTH(0);
        private int swh;

        SSLSwitch(int swh) {
            this.swh = swh;
        }

        public int getSwh() {
            return swh;
        }

        public void setSwh(int swh) {
            this.swh = swh;
        }
    }

    private String listenIP;
    private int listenPort;
    private int sslSwitch = SSLSwitch.SSL_ON_CLIENT_AUTH.getSwh();

    private Resource caCert;
    private Resource sslCert;
    private Resource sslKey;

    public Resource getCaCert() {
        return caCert;
    }

    public void setCaCert(Resource caCert) {
        this.caCert = caCert;
    }

    public Resource getSslCert() {
        return sslCert;
    }

    public void setSslCert(Resource sslCert) {
        this.sslCert = sslCert;
    }

    public Resource getSslKey() {
        return sslKey;
    }

    public void setSslKey(Resource sslKey) {
        this.sslKey = sslKey;
    }

    public String getListenIP() {
        return listenIP;
    }

    public void setListenIP(String listenIP) {
        this.listenIP = listenIP;
    }

    public int getListenPort() {
        return listenPort;
    }

    public void setListenPort(int listenPort) {
        this.listenPort = listenPort;
    }

    public int getSslSwitch() {
        return sslSwitch;
    }

    public void setSslSwitch(int sslSwitch) {
        this.sslSwitch = sslSwitch;
    }

    @Override
    public String toString() {
        return "RPCConfig{"
                + "listenIP='"
                + listenIP
                + '\''
                + ", listenPort="
                + listenPort
                + ", sslSwitch="
                + sslSwitch
                + ", caCert="
                + caCert
                + ", sslCert="
                + sslCert
                + ", sslKey="
                + sslKey
                + '}';
    }
}