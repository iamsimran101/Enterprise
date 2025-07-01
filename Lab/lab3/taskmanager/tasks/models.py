from django.db import models

class Task(models.Model):
    title = models.CharField(max_length=100)              # Short title
    description = models.TextField()                      # Detailed description
    completed = models.BooleanField(default=False)        # True or False

    def __str__(self):
        return self.title  # To display task title as object name in admin panel

