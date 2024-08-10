package com.devteria.identityservice.repository.httpclient;

import com.devteria.identityservice.dto.response.ExchangeTokenResponse;
import com.devteria.identityservice.dto.response.OutboundUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "outbound-user-client", url = "https://www.googleapis.com")
public interface OutboundUserClient {
    @GetMapping(value = "/oauth2/v1/userinfo")
    OutboundUserResponse getUserInfo(@RequestParam("alt") String alt,
                                     @RequestParam("access_token") String accessToken);
}
