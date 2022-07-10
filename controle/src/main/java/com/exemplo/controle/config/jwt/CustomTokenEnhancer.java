package com.exemplo.controle.config.jwt;

import com.exemplo.controle.config.user.UserSystem;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

public class CustomTokenEnhancer implements TokenEnhancer {

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        UserSystem usuarioLogado = (UserSystem) oAuth2Authentication.getPrincipal();

        Map<String, Object> addInfo = new HashMap<>();
        addInfo.put("usuario", usuarioLogado.getUsuario().getLogin());

        ((DefaultOAuth2AccessToken) oAuth2AccessToken).setAdditionalInformation(addInfo);
        return oAuth2AccessToken;
    }

}
