package com.whatsapp.api.domain.templates;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FooterComponent extends Component<FooterComponent> {


    public FooterComponent() {
        super(ComponentType.FOOTER);
    }


}
