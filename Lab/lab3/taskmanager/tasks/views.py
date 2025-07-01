from django.shortcuts import render, redirect
from .models import Task

# View to display list of tasks
def task_list(request):
    tasks = Task.objects.all()
    return render(request, 'tasks/task_list.html', {'tasks': tasks})

# View to add a new task
def add_task(request):
    if request.method == 'POST':
        title = request.POST['title']
        desc = request.POST['description']
        Task.objects.create(title=title, description=desc)
        return redirect('task_list')
    return render(request, 'tasks/add_task.html')

# View to delete a task
def delete_task(request, id):
    task = Task.objects.get(id=id)
    task.delete()
    return redirect('task_list')
