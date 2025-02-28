/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.13.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
@Validated
@Tag(name = "dummy", description = "the dummy API")
public interface DummyApi {

    default DummyApiDelegate getDelegate() {
        return new DummyApiDelegate() {};
    }

    /**
     * POST /dummy
     * 
     *
     * @param body  (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "uploadFile",
        description = "",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/dummy",
        consumes = { "application/octet-stream" }
    )
    
    default ResponseEntity<Void> uploadFile(
        @Parameter(name = "body", description = "") @Valid @RequestBody(required = false) Optional<org.springframework.core.io.Resource> body
    ) {
        return getDelegate().uploadFile(body);
    }

}
