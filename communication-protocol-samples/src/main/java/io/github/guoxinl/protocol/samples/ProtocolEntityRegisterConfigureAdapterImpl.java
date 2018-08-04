package io.github.guoxinl.protocol.samples;

import io.github.guoxinl.protocol.analysis.conf.register.ProtocolEntityRegister;
import io.github.guoxinl.protocol.analysis.conf.register.adapter.ProtocolEntityRegisterConfigureAdapter;

/**
 * Created by guoxin on 18-3-10.
 */
public class ProtocolEntityRegisterConfigureAdapterImpl extends ProtocolEntityRegisterConfigureAdapter {

    public static void main(String[] args) {
//        ProtocolEntityRegisterConfigureAdapter abstractDataProtocolCode = new ProtocolEntityRegisterConfigureAdapterImpl();
//        ProtocolEntitySet                      build                    = abstractDataProtocolCode.build();
//        System.out.println(build.toString());
    }

    @Override
    public void register(ProtocolEntityRegister register) {
        register.register(UpgradeProtocol.class);
    }
}
