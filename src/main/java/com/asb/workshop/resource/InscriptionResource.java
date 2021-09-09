package com.asb.workshop.resource;

import com.asb.workshop.model.Inscription;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InscriptionResource extends ResourceConverter<Inscription, InscriptionResource> {
	
	public Long idInscription;
	public String name;
	public String lastName;
	public Long idDocumentType;
	public String documentType;
	public String document;
	public String classroom;
	public String address;
	public String phone;
	public String urlPhoto;
	public Long idStatus;
	public String status;
	public Boolean copyDocument;
	public String promotion;

	@Override
	public InscriptionResource convert(Inscription inscription)
	{
		return InscriptionResource.builder()
				.idInscription(inscription.getIdInscription())
				.name(inscription.getUser().getName())
				.lastName(inscription.getUser().getLastName())
				.idDocumentType(inscription.getUser().getDocumentType().getIdParameter())
				.documentType(inscription.getUser().getDocumentType().getDescription())
				.document(inscription.getUser().getDocument())
				.classroom(inscription.getClassroom().getClassroom())
				.address(inscription.getUser().getAddress())
				.phone(inscription.getUser().getPhone())
				.urlPhoto(inscription.getUser().getUrlPhoto())
				.idStatus(inscription.getUser().getStatus().getIdParameter())
				.status(inscription.getUser().getStatus().getDescription())
				.copyDocument(inscription.getUser().getCopyDocument())
				.promotion(inscription.getUser().getPromotion())
				.build();
	}

}
