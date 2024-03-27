package com.viana.vatresearch.client;

import com.viana.vatresearch.client.model.VatInfoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "vatApiClient", url = "${vat.api.url}")
public interface VatApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/check", consumes = "application/json")
    VatInfoResponse checkVatNumber(@RequestParam(name = "apikey") String apiKey, @RequestParam(name = "vat_number") String vatNumber,
                                   @RequestParam(required = false, name = "country_code") String countryCode);
}
