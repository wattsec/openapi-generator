package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.io.File;
import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;
import java.util.Set;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
public abstract class PetApiService {
    public abstract Response addPet(Pet body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deletePet(Long petId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findPetsByStatus( @NotNull List<String> status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findPetsByTags( @NotNull Set<String> tags,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPetById(Long petId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePet(Pet body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadFile(Long petId,String additionalMetadata,FormDataBodyPart _fileBodypart,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadFileWithRequiredFile(Long petId,FormDataBodyPart requiredFileBodypart,String additionalMetadata,SecurityContext securityContext) throws NotFoundException;
}
