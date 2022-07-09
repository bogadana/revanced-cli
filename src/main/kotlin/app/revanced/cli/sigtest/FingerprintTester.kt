package app.revanced.cli.sigtest

import app.revanced.cli.command.MainCommand.logger
import app.revanced.patcher.extensions.MethodFingerprintExtensions.name

class FingerprintTester {
    internal fun start(patcher: app.revanced.patcher.Patcher) {
        patcher.resolvedFingerprints.forEach { fingerprint ->
            logger.info("${fingerprint.name} results:")
            fingerprint.results.forEach { result ->
                logger.info("\tmethod ${result.method}")
            }

        }
    }
}
