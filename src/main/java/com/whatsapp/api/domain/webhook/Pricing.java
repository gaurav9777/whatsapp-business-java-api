package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @param pricingModel Type of pricing model being used. Current supported values are:<ul>
 *                     <li>"CBP" (conversation-based pricing): See Conversation-Based Pricing for rates based on recipient country.</li>
 *                     <li>"NBP" (notification-based pricing): Notifications are also known as Template Messages (click here for details on pricing).</li>
 *                     This pricing model will be deprecated in a future release early 2022.</ul>
 * @param category
 * @param billable
 */
public record Pricing(

        @JsonProperty("pricing_model") String pricingModel,

        @JsonProperty("category") String category,

        @JsonProperty("billable") boolean billable

) {


}