jobs = Jenkins.instance.getAllItems()
jobs.each { job ->
  job.getBuilds().each { it.delete() }
  // uncomment these lines to reset the build number to 1:
  job.nextBuildNumber = 1
  job.save()
}
