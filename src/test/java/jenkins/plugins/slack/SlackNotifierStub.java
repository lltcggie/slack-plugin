package jenkins.plugins.slack;

public class SlackNotifierStub extends SlackNotifier {

    public SlackNotifierStub(String webhookId, String authToken, boolean botUser, String authTokenCredentialId,
                             String sendAs, boolean startNotification, boolean notifyAborted, boolean notifyFailure,
                             boolean notifyNotBuilt, boolean notifySuccess, boolean notifyUnstable, boolean notifyBackToNormal,
                             boolean notifyRepeatedFailure, boolean includeTestSummary, boolean includeFailedTests, 
                             CommitInfoChoice commitInfoChoice, boolean includeCustomMessage, String customMessage) {
        super(webhookId, authToken, botUser, authTokenCredentialId, sendAs, startNotification, notifyAborted, notifyFailure,
                notifyNotBuilt, notifySuccess, notifyUnstable, notifyBackToNormal, notifyRepeatedFailure,
                includeTestSummary, includeFailedTests, commitInfoChoice, includeCustomMessage, customMessage);
    }

    public static class DescriptorImplStub extends SlackNotifier.DescriptorImpl {

        private SlackService slackService;

        @Override
        public synchronized void load() {
        }

        @Override
        SlackService getSlackService(final String webhookId, final String authToken, final String authTokenCredentialId, final boolean botUser) {
            return slackService;
        }

        public void setSlackService(SlackService slackService) {
            this.slackService = slackService;
        }
    }
}
