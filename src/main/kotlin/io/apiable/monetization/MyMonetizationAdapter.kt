package io.apiable.monetization


import io.apiable.monetization.adapter.Monetization
import io.apiable.monetization.adapter.MonetizationCheckoutSession
import io.apiable.monetization.adapter.MonetizationInvoice
import io.apiable.monetization.adapter.SubscriptionUsageReport
import io.apiable.monetization.adapter.model.AccountLinkData
import io.apiable.monetization.adapter.model.BillingPrice
import io.apiable.monetization.adapter.model.BillingPriceCreate
import io.apiable.monetization.adapter.model.MonetizationAccountStatus
import io.apiable.monetization.adapter.model.MonetizationCustomer
import io.apiable.monetization.adapter.model.MonetizationProduct
import io.apiable.monetization.adapter.model.MonetizationSubscription
import io.apiable.monetization.adapter.model.StripeSubscriptionUsageItem
import org.slf4j.LoggerFactory


class MyMonetizationAdapter() : Monetization {

    companion object {
        private val logger = LoggerFactory.getLogger(this::class.java)
    }

    override fun canCreateSubscriptionWithCurrency(
        customerIntegrationId: String,
        currency: String
    ): Boolean {
        logger.info("canCreateSubscriptionWithCurrency")
        TODO("Not yet implemented")
    }

    override fun cancelSubscription(
        subscriptionIntegrationId: String,
        immediately: Boolean
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun createAccount(data: AccountLinkData): String {
        TODO("Not yet implemented")
    }

    override fun createBillingPortalConfiguration(
        privacyPolicyUrl: String,
        tosUrl: String
    ): String {
        TODO("Not yet implemented")
    }

    override fun createPrice(priceData: BillingPriceCreate): BillingPrice {
        TODO("Not yet implemented")
    }

    override fun createProduct(
        planId: String,
        name: String,
        description: String,
        imageUrl: String
    ): MonetizationProduct {
        TODO("Not yet implemented")
    }

    override fun createUser(
        email: String,
        name: String
    ): MonetizationCustomer {
        TODO("Not yet implemented")
    }

    override fun doesProductExist(productIntegrationId: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun expireCheckoutSession(checkoutSessionId: String) {
        TODO("Not yet implemented")
    }

    override fun findNextInvoiceDateForSubscription(subscriptionIntegrationId: String): Long? {
        TODO("Not yet implemented")
    }

    override fun findPriceByLookupKey(lookupKey: String): BillingPrice? {
        TODO("Not yet implemented")
    }

    override fun findSubscriptionInvoices(subscriptionIntegrationId: String): List<MonetizationInvoice> {
        TODO("Not yet implemented")
    }

    override fun getAccountDashboardLoginLink(): String {
        TODO("Not yet implemented")
    }

    override fun getAccountStatus(): MonetizationAccountStatus {
        TODO("Not yet implemented")
    }

    override fun getEndCustomerBillingPortalLink(
        endCustomerProviderId: String,
        subscriptionIntegrationId: String
    ): String {
        TODO("Not yet implemented")
    }

    override fun getMeteredUsageSummary(subscriptionId: String): List<StripeSubscriptionUsageItem>? {
        TODO("Not yet implemented")
    }

    override fun getMeteredUsageSummaryForSubscriptionItem(subscriptionItemId: String): StripeSubscriptionUsageItem {
        TODO("Not yet implemented")
    }

    override fun getMeteredUsageTotal(subscriptionId: String): Long {
        TODO("Not yet implemented")
    }

    override fun getPriceById(priceIntegrationId: String): BillingPrice {
        TODO("Not yet implemented")
    }

    override fun getProduct(productIntegrationId: String): MonetizationProduct {
        TODO("Not yet implemented")
    }

    override fun getUser(userIntegrationId: String): MonetizationCustomer {
        TODO("Not yet implemented")
    }

    override fun isLookupKeyUsed(lookupKey: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun refreshSubscriptionByCheckoutId(checkoutSessionId: String): MonetizationSubscription {
        TODO("Not yet implemented")
    }

    override fun refreshSubscriptionById(subscriptionIntegrationId: String): MonetizationSubscription {
        TODO("Not yet implemented")
    }

    override fun reportMeteredUsage(
        subscriptionId: String,
        quantity: Long,
        timestamp: Long,
        setInsteadOfIncrement: Boolean,
        lookupKey: String?
    ): SubscriptionUsageReport? {
        TODO("Not yet implemented")
    }

    override fun subscriptionCheckout(
        returnUrlBase: String,
        monetizationProductId: String,
        monetizationPriceIds: List<String>,
        monetizationCustomerId: String
    ): MonetizationCheckoutSession? {
        TODO("Not yet implemented")
    }

    override fun unlinkAccount() {
        TODO("Not yet implemented")
    }

    override fun updatePrice(
        integrationId: String,
        priceData: BillingPriceCreate
    ): BillingPrice {
        TODO("Not yet implemented")
    }

    override fun updateProduct(
        productIntegrationId: String,
        name: String,
        description: String,
        imageUrl: String
    ): MonetizationProduct {
        TODO("Not yet implemented")
    }

    override fun updateSubscription(
        subscriptionIntegrationId: String,
        productIntegrationId: String
    ): Boolean {
        TODO("Not yet implemented")
    }

}
